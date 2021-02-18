provider "aws" {
access_key= $AWS_ACCESS_KEY_ID
secret_key= $AWS_SECRET_ACCESS_KEY
region = "us-east-1"
}


resource "aws_instance" "instance1" {
ami = "ami-07f5c641c23596eb9"
instance_type = "t2.micro"

}
