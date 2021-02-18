provider "aws" {
access_key = "AKIAJLYVZAZUKQ5O2FOQ"
secret_key = "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"
region = "us-east-1"
}


resource "aws_instance" "instance1" {
ami = "ami-07f5c641c23596eb9"
instance_type = "t2.micro"

}
