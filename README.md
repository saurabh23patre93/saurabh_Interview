# Saurabh Patre
# dashboard-api-parent-> This project create using Swagger YML file.
# Swagger API Output:



# dashboard_service--> Rest Client API created from Swgger YML file using Swagger Codegen.


## Rest API Output:
1)	Containment Output:
URL: http://localhost:8081/dashboard/v1/api/containment

Request:
{
    "businessUnit": "HD",
    "fromDate": "09/09/2023",
    "toDate": "010/09/2023"
}

Response:
[
    {
        "total": 70,
        "contained": 30,
        "notContained": 40
    }
]

3)	Impact Control Output:
URL: http://localhost:8081/dashboard/v1/api/impactControl

Request:
{
    "lanId": "C6xdhaf"
}

Response:
[{"businessUnit":"HD","dnis":234}]

3)	Caller Intent Output:
URL: http://localhost:8081/dashboard/v1/api/callerIntent

Request:
{
    "businessUnit": "HD",
    "fromDate": "09/09/2023",
    "toDate": "010/09/2023"
}

Response:
[{"callTransfer":40,"GhostCALL":15,"CFT Call":15,"Authenticated Call":30}]

4)	Authentication Type Output:
URL: http://localhost:8081/dashboard/v1/api/auth

Request:
{
    "businessUnit": "HD",
    "fromDate": "09/09/2023",
    "toDate": "010/09/2023"
}

Response:
[{"FullyAuth":30,"PartialAuth":30,"NoAuth":10,"Authenticated Call":30}]


5)	Bot Level Output:
URL: http://localhost:8081/dashboard/v1/api/botLevel

Request:
{
    "businessUnit": "HD",
    "fromDate": "09/09/2023",
    "toDate": "010/09/2023"
}

Response:
[{"Refill":30,"OrderStatus":20,"Balance &amp; Payment":30,"Retail Call":20}]



