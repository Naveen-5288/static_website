provider "aws" {
  region = "ap-south-1"
}

resource "aws_s3_bucket" "static_site" {
  bucket = "your-bucket-name"
  acl    = "public-read"

  website {
    index_document = "index.html"
  }
}

resource "aws_s3_bucket_policy" "public_policy" {
  bucket = aws_s3_bucket.static_site.id

  policy = jsonencode({
    Version = "2012-10-17"
    Statement = [{
      Effect = "Allow"
      Principal = "*"
      Action = ["s3:GetObject"]
      Resource = "${aws_s3_bucket.static_site.arn}/*"
    }]
  })
}
