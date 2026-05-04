//console.log(process.env);


/*dotENV = require('dotenv')
dotENV.config()*/
require('dotenv').config()  // process .env file

console.log(process.env.DB_USERNAME);
console.log(process.env.PORT);

