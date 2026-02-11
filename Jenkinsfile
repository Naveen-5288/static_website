pipeline {
  agent any
  environment {
    AWS_ACCESS_KEY_ID     = credentials('aws-access-key-id')
    AWS_SECRET_ACCESS_KEY = credentials('aws-secret-access-key')
    AWS_DEFAULT_REGION    = 'ap-south-1'
  }
  stages {
    stage('Clone Repo') {
      steps {
        git branch: 'test',
        git 'https://github.com/Naveen-5288/static_website.git'
      }
    }
    stage('Terraform Init') {
      steps {
        bat 'terraform init'
      }
    }

    stage('Terraform Validate') {
      steps {
        bat 'terraform validate'
      }
    }

    stage('Terraform Plan'){
      steps{
        bat 'terraform plan'
      }
    }
    stage('Terraform Apply') {
      steps {
        bat 'terraform apply -auto-approve'
      }
    }
    stage('Upload HTML') {
      steps {
        bat 'aws s3 cp index.html s3://${bucket_name}/'
      }
    }
  }
}
