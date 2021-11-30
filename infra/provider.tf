terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "3.56.0"
    }
  }
  backend "s3" {
    bucket = "pgr301-phhe002-terraform"
    key    = "terraform-state"
    region = "eu-west-1"
  }
}

resource "aws_ecr_repository" "ecr_repository" {
  name = "phhe002"

  image_scanning_configuration {
    scan_on_push = true
  }
}
