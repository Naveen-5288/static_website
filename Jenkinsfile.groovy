pipeline {
    agent any

    environment {
        AWS_ACCESS_KEY_ID = credentials('AWS_ACCESS_KEY_ID')
        AWS_SECRET_ACCESS_KEY = credentials('AWS_SECRET_ACCESS_KEY')
        BUCKET_NAME = 'my-static-site-5288'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Naveen-5288/mini-project-01.git'
            }
        }

        stage('Deploy to S3') {
            steps {
                sh '''
                aws configure set aws_access_key_id $AWS_ACCESS_KEY_ID
                aws configure set aws_secret_access_key $AWS_SECRET_ACCESS_KEY
                aws s3 sync . s3://my-static-site-5288 --delete
                '''
            }
        }
    }
}
