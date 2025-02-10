import React from 'react'
import userLogin from '../../../images/userLogin.jpg'

function UserLogin() {
  return (
    <div className="flex justify-center items-center h-screen bg-cover bg-center" style={{ backgroundImage: `url(${userLogin})`}}>
      <div className="w-80 p-6 bg-white/20 bg-opacity-20 backdrop-blur-md shadow-md rounded-lg border border-white">
        <h2 className="text-white text-xl font-semibold text-center mb-4">User Login</h2>
        <form action="/login/userLogin" method="post" className="flex flex-col space-y-4">
          <div>
            <label htmlFor="username" className="text-white block mb-1">Username:</label>
            <input type="text" id="username" name="userName" className="w-full p-2 bg-transparent border border-white text-white rounded-lg focus:outline-none placeholder-white" placeholder="Enter username" />
          </div>
          <div>
            <label htmlFor="password" className="text-white block mb-1">Password:</label>
            <input type="password" id="password" name="password" className="w-full p-2 bg-transparent border border-white text-white rounded-lg focus:outline-none placeholder-white" placeholder="Enter password" />
          </div>
          <button type="submit" className="bg-white text-black py-2 rounded-lg hover:bg-transparent hover:text-white border border-white transition">Login</button>
          <p className="text-white text-xs text-center">Don't have an account? <a href="/registration/add-User" className="text-orange-400 hover:text-orange-500">Register as User</a></p>
          <p className="text-white text-xs text-center">Login as Admin: <a href="/login/admin-Login" className="text-orange-400 hover:text-orange-500">Login as Admin</a></p>
        </form>
      </div>
    </div>
  )
}

export default UserLogin
