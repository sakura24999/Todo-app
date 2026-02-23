import json
import boto3

def lambda_handler(event, context):
    sns = boto3.client(
        "sns",
        endpoint_url="http://localhost:4566",
        region_name="ap-northeast-1",
        aws_access_key_id="test",
        aws_secret_access_key="test"
    )
    
    sns.publish(
        TopicArn="arn:aws:sns:ap-northeast-1:000000000000:notify-topic",
        Message="Lambda実行されました!",
        Subject="Lambda通知"
    )
    
    return {
        "statusCode": 200,
        "body": json.dumps({"message": "通知送信完了!"})
    }