# 🚀 Static Website Hosting on AWS S3 using Terraform & Jenkins
## 📌 Project Overview

This project demonstrates an end-to-end DevOps implementation for hosting a static website on AWS S3 using Infrastructure as Code (Terraform) and CI/CD automation (Jenkins).
The pipeline provisions AWS infrastructure and deploys website content automatically.


## 🛠️ Tech Stack

* AWS S3 (Static Website Hosting)
* Terraform (Infrastructure Provisioning)
* Jenkins (CI/CD Pipeline)
* AWS CLI
* Git & GitHub



## 📂 Repository Structure

static_website/
│
├── terraform/
│   ├── main.tf
│   ├── provider.tf
│   ├── variables.tf
│   ├── terraform.tfvars
│
├── Jenkinsfile
├── index.html
└── README.md


## ⚙️ Terraform Infrastructure

Terraform provisions:

* S3 Bucket
* Static Website Hosting
* Bucket Policy (Public Read Access)
* Ownership Controls
* Public Access Block Configuration


## 🔄 Jenkins Pipeline Stages

1. Clone GitHub Repository
2. Terraform Init
3. Terraform Validate
4. Terraform Plan
5. Terraform Apply
6. Fetch Bucket Name (Output)
7. Upload Website Files to S3

##  Deployment Steps

### 1️⃣ Clone Repository

git clone https://github.com/<username>/static_website.git

### 2️⃣ Configure AWS CLI

aws configure

Provide:

* Access Key
* Secret Key
* Region

### 3️⃣ Run Terraform
terraform init
terraform plan
terraform apply

### 4️⃣ Access Website

http://<bucket-name>.s3-website-ap-south-1.amazonaws.com

## 🔐 Jenkins Credentials Used

* AWS_ACCESS_KEY_ID
* AWS_SECRET_ACCESS_KEY

Stored securely in Jenkins Credentials Manager.

## ⭐ If you like this project, give it a star!
