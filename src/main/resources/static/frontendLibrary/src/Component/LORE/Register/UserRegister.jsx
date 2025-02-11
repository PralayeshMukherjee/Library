import React from 'react'

function UserRegister() {
  return (
    <div className="bg-gradient-to-r from-blue-500 to-purple-600 flex items-center justify-center min-h-screen">
      <div className="bg-white bg-opacity-20 backdrop-blur-lg rounded-xl shadow-lg p-8 w-full max-w-md">
        <h2 className="text-2xl font-semibold text-center text-white mb-4">Register</h2>
        <form onSubmit={handleSubmit} className="space-y-4">
          <input name="username" type="text" placeholder="Username" onChange={handleChange} className="w-full mt-1 p-2 rounded-lg bg-white bg-opacity-50 focus:outline-none" required />
          <input name="password" type="password" placeholder="Password" onChange={handleChange} className="w-full mt-1 p-2 rounded-lg bg-white bg-opacity-50 focus:outline-none" required />
          <input name="fullName" type="text" placeholder="Full Name" onChange={handleChange} className="w-full mt-1 p-2 rounded-lg bg-white bg-opacity-50 focus:outline-none" required />
          <input name="age" type="number" placeholder="Age" onChange={handleChange} className="w-full mt-1 p-2 rounded-lg bg-white bg-opacity-50 focus:outline-none" required />
          <input name="phone" type="tel" placeholder="Phone Number" onChange={handleChange} className="w-full mt-1 p-2 rounded-lg bg-white bg-opacity-50 focus:outline-none" required />
          <input name="email" type="email" placeholder="Email ID" onChange={handleChange} className="w-full mt-1 p-2 rounded-lg bg-white bg-opacity-50 focus:outline-none" required />
          <select name="gender" onChange={handleChange} className="w-full mt-1 p-2 rounded-lg bg-white bg-opacity-50 focus:outline-none" required>
            <option value="">Select Gender</option>
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="other">Other</option>
          </select>
          <button type="submit" className="w-full bg-purple-500 hover:bg-purple-700 text-white font-bold py-2 rounded-lg">Register</button>
        </form>
      </div>
    </div>
  )
}

export default UserRegister
