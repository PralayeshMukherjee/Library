import { useState } from 'react'
import { createBrowserRouter, createRoutesFromElements, Route, RouterProvider } from 'react-router-dom'
import {Layout} from './Component/index'

function App() {
  const [count, setCount] = useState(0)
  const MyRouter = createBrowserRouter(
    createRoutesFromElements(
      <Route path='/' element={<Layout/>} >

      </Route>
    )
  )
  return (
    <>
      <RouterProvider router={MyRouter} />
    </>
  )
}

export default App
