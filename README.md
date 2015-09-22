# json2java
JavaScriptObjectNotation to Java Object structure, in JavaCC

With this library you can map a JSON object into a Java object
using the following conversion table:

| JSON Element | Java Type |
| --- | --- |
| true/false | boolean |
| "..." / '...' | String |
| 123.456 | float |
| 123456 | int |
| Object | Map&lt;String, Element&gt; |
| Array | List&lt;Element&gt; |
