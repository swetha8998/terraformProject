pipeline{
   agent any
  
   environment {
    AWS_ACCESS_KEY_ID     = credentials('aws_access_id')
    AWS_SECRET_ACCESS_KEY = credentials('aws_secret_key')
}
   stages{
       stage('git chechout'){
           steps{
             git branch: 'branch1', url: 'https://github.com/swetha8998/terraformProject.git'
           }
       }
       stage('Terraform init'){
           steps{
               sh 'terraform init'
           }
       }
        stage('Terraform apply'){
           steps{
               sh 'terraform apply --auto-approve'
           }
       }
   }
 }
