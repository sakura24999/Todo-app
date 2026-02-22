import json
import boto3
import os

def lambda_handler(event, context):
    endpoint_url = os.getenv("LOCALSTACK_HOSTNAME")
    if endpoint_url:
        s3 = boto3.client("s3", endpoint_url=f"http://{endpoint_url}:4566")
    return {
        "statusCode": 200,
        "body": json.dumps({"message": "Hello from LocalStack!"})
    }