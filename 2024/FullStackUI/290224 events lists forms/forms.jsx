import { Component } from "react";

export class MyForm extends Component{
    constructor() {
        super();
        this.state = {
        };
      }
    
      submitHandlerPrintsJSON(ev) {
        // This event handler shows us how to create a JSON object,
        // using data from the form.
        // All we need to do is to create a JSON (myJSON) and put inside it
        // all the data we want, in the form of key-value pairs.
        console.log(ev);
        const myJSON = {
            parameter1: document.myform.username.value
        }
        console.log(myJSON);
        ev.preventDefault();
    }

      submitHandler(ev) {
        // Here, we use conditions to decide wether to submit the form, or not.
        if(document.myform.username.value == ''){
            // This function cencel the submit-
            ev.preventDefault();
        }
        else{
            console.log("all good with form");
            console.log(document.myform.username.value);
        }
      }


      // We build a simple form structure.
      // Notice:
      //    1. the use of 'onSubmit' even.
      //    2. the use of spewcial input types: submit, reset.
      //    3. give names to inputs.
      render(){
        return(
            <form name="myform" onSubmit={this.submitHandler}>
                <label htmlFor="username">User Name:</label>
                <input name="username" type="text" /> <br />

                <input type="submit" value={"submit"} />
                <input type="reset" value={"reset"} />
            </form>
        );
      }
}