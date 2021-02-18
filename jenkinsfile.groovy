node{
    stage("checkout"){
        checkout scm
    }
    stage("Terraform init"){
       
     sh "terraform init"
    }
   
    stage("plan"){
        
        sh "terraform plan"
    }
    stage("terraform apply"){
    
    sh "terraform apply"
    
    }
}
