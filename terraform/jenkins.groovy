pipeline {
  agent any
  environment {
    AWS_ACCESS_KEY_ID     = credentials('aws-access-key-id')
    AWS_SECRET_ACCESS_KEY = credentials('aws-secret-access-key')
    AWS_DEFAULT_REGION    = 'ap-south-1' // replace if using a different region
  }
  stages {
    stage('Terraform Init') {
      steps {
        bat 'terraform init'
      }
    }
    stage('Terraform Plan') {
      steps {
        bat 'terraform plan'
      }
    }
    stage('Terraform Apply') {
      steps {
        bat 'terraform apply -auto-approve'
      }
    }
  }
}
