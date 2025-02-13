import React, { useState } from "react";

function Sellers() {
  const [sellers, setSellers] = useState("");
  const query = sessionStorage.getItem("title");
  setSellers(query);
  return (
    <div>
      {sellers.length > 0 && (
        <ul className="mt-4 bg-white shadow-lg rounded p-4">
          {sellers.map((seller) => (
            <li key={seller.id} className="p-2 border-b">
              📚 Seller: {seller.name} | 📧 {seller.email}
            </li>
          ))}
        </ul>
      )}
    </div>
  );
}

export default Sellers;
