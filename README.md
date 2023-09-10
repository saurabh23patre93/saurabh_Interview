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



