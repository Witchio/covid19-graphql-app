### SpringBoot GraphQL - API

This application reads covid data from [https://disease.sh/v3/covid-19/countries](https://disease.sh/v3/covid-19/countries) stored in a json file and exposes them to a graphQL api endpoint.

The application is built with SpringBoot. To start the application, enter following command in the terminal from the project root folder :

`gradle bootrun`

and then go to [localhost:8080/graphiql](localhost:8080/graphiql).

The application allows to retrieve the data for individual countries or for a list of countries (see schema.graphqls for query structures).
It can also display the list of available countries and find the country with the most/least cases.

