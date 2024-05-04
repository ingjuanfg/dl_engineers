
# AI and Translations Web Automation

This project aims to develop a scalable solution for automating web pages in different languages using a translation API and AI tools. Automation is achieved through the following steps:

## Tools
- SerenityBDD
- Java
- Gradle
- Healenium
- Json Server
- Docker
- Screenplay
- Cucumber
- Lombok
- Git
- Github
- POM
- Json
- Quality Strategies

## 1. API Query:

The translation API is queried to obtain translations for the webpage content.
Different translation APIs are supported for flexibility and reliability.
A caching system is implemented to optimize performance and reduce resource consumption.

### How to run the API

- Go to [language_api](src%2Ftest%2Fresources%2Flanguage_api) 
- Run in a terminal ```npm install json-server```
- Then, run ```npx json-server db.json```
- To verify, open in a browser http://localhost:3000/


## 2. Content Modeling:

The structure and content of the original webpage are analyzed.
Translated content is transformed to fit the webpage's structure.
Natural Language Processing (NLP) techniques are used to understand the meaning of the text and translate it accurately and contextually.

## 3. Webpage Injection:

Translated and modeled content is injected into the webpage.
Compatibility with different web browsers and devices is ensured.

## 4. AI-powered Updates:

AI tools are used to detect changes in the original webpage.
The specific element that has changed is identified.
The translation of the changed element is updated accordingly.
The impact of changes on automated test execution is minimized.
Benefits:

### Scalability: The solution can adapt to webpages of any size and complexity.
Efficiency: Automation reduces the time and effort required for translating and maintaining multilingual webpages.
### Accuracy: AI ensures translations are accurate and up-to-date.
Enhanced User Experience: Users can access information in their preferred language, improving the overall experience.

### Flow IA Test UI

![FlowIA](https://i.postimg.cc/HWb45Y2s/dl-engineers.jpg)

### How to run Healenium

Preconditions: You need Docker installed on your laptop.

- Go to [healenium](healenium)
- Run in a terminal ```docker compose up -d```

## 5. Test Case for API

To check the test. Please run [RunnerApi.java](src%2Ftest%2Fjava%2Forg%2Fexample%2Frunners%2FRunnerApi.java)

## 6. Test Case for AI

To check the test. Please run [FindAndHealElementTest.java](src%2Ftest%2Fjava%2Forg%2Fexample%2Frunners%2FFindAndHealElementTest.java)

This is how it looks

![Ai](https://i.postimg.cc/G3PFpvvh/asdasd.jpg)

Implementation Steps:

- Requirement Definition: Specify target languages, webpages to automate, and functionalities needed.
- Translation API Selection: Choose a reliable translation API offering translations for the target languages.
- Automation Engine Development: Create a software engine to automate API queries, content modeling, and webpage injection.
- AI Update Implementation: Integrate AI tools to detect webpage changes and update translations accordingly.
- Testing and Validation: Conduct thorough testing to ensure the solution functions correctly in various scenarios.

- Additional Tools:

- Analytics Tools: SerenityBDD report. To see it. Please run ```gradle aggregate``` after running the tests.

## API Reference
https://www.npmjs.com/package/json-server

#### Get all elements with translations

```http
  GET /languages
```

| Parameter | Type     | Description |
|:----------| :------- |:------------|
| `NA`      | `string` |             |     

## Report

![Report1](https://i.postimg.cc/s2JwpVyh/Captura-de-pantalla-2024-05-04-033938.png)
![Report2](https://i.postimg.cc/d0F5k7MF/Captura-de-pantalla-2024-05-04-033950.png)
![Report3](https://i.postimg.cc/QxR4D40H/Captura-de-pantalla-2024-05-04-034000.png)


## Authors

- [@ingjuanfg](https://github.com/ingjuanfg)
- [@dannybarrientos](https://www.github.com/dannybarrientos)
- [@DAVIDCHAMI](https://github.com/DAVIDCHAMI)

