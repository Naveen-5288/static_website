// to delete files from s3
pipeline {
    agent any
    environment {
        //AWS_ACCESS_KEY_ID = credentials('aws-access-key-id')
        //AWS_SECRET_ACCESS_KEY = credentials('aws-secret-access-key')
        AWS_DEFAULT_REGION = 'ap-south-1' // replace if using different region
    }
    stages {
        stage('Delete S3 Files') {
            steps {
                // This will recursively delete all files inside the bucket
                bat 'aws s3 rm s3://my-static-site-5288 --recursive'
            }
        }
    }
}
