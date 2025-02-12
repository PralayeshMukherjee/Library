import {
  createBrowserRouter,
  createRoutesFromElements,
  Route,
  RouterProvider,
} from "react-router-dom";
import {
  Layout,
  Home,
  UserLogin,
  UserRegister,
  UserRegisterSuccess,
  MainHeader,
  MainLayout,
  MainFooter,
  MainHome,
} from "./Component/index";

function App() {
  const MyRouter = createBrowserRouter(
    createRoutesFromElements(
      <>
        <Route path="/Landing" element={<Layout />}>
          <Route index element={<Home />} />
          //for when / hit the url then home page automaticly loaded
          <Route path="home" element={<Home />} />
        </Route>
        <Route path="/userLogin" element={<UserLogin />} />
        <Route path="/userRegister" element={<UserRegister />} />
        <Route path="/UserRegisterSuccess" element={<UserRegisterSuccess />} />
        <Route path="/Main" element={<MainLayout />}>
          <Route index element={<MainHome />} />
          <Route path="MainHome" element={<MainHome />} />
        </Route>
      </>
    )
  );
  return (
    <>
      <RouterProvider router={MyRouter} />
    </>
  );
}

export default App;
