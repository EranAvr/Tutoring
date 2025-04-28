import './App.css'

import SignupCard from './fetchAPI/signup_card'
import ProductsPage from './fetchAPI/products'

function App() {
  console.log("Main page loaded OK")

  return(
    <>
      <SignupCard />
      <br />
      <ProductsPage title="Fetched Products" url="https://fakestoreapi.com/products/" />
    </>
      
  )
}

export default App
