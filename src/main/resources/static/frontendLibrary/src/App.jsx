import { createBrowserRouter, createRoutesFromElements, Route, RouterProvider } from 'react-router-dom'
import {Layout,Home,UserLogin} from './Component/index'

function App() {
  const MyRouter = createBrowserRouter(
    createRoutesFromElements(
      <>
      <Route path='/' element={<Layout/>} >
        <Route index element={<Home/>}/>//for when / hit the url then home page automaticly loaded
        <Route path='home' element={<Home/>}/>
      </Route>
      <Route path='userLogin' element={<UserLogin/>}/>
      </>
    )
  )
  return (
    <>
      <RouterProvider router={MyRouter} />
    </>
  )
}

export default App
