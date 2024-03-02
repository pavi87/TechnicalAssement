    Planted API:
        Endpoint: /api/planted
        Method: POST
        Request Body: JSON data containing planting information.
        Functionality: Accepts planting data for a specific farm and season and stores it in the database.

    Harvested API:
        Endpoint: /api/harvested
        Method: POST
        Request Body: JSON data containing harvested information.
        Functionality: Accepts harvested data for a specific farm and season, calculates the actual vs expected product, and stores it in the database.

    Farm Report API:
        Endpoint: /api/report/farm/{farmName}/season/{season}
        Method: GET
        Functionality: Fetches and displays the expected vs actual product for each crop planted on the specified farm for the given season. The {farmName} and {season} path parameters specify the farm name and season for which the report is requested.

    Crop Report API:
        Endpoint: /api/report/crop/{cropName}/season/{season}
        Method: GET
        Functionality: Fetches and displays the expected vs actual product for the specified crop across all farms for the given season. The {cropName} and {season} path parameters specify the crop name and season for which the report is requested.
