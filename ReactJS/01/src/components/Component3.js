import React from 'react'


const products = [
    {name: "Product 1", bool: true, id: 1},
    {name: "Product 2", bool: false, id: 2},
    {name: "Product 3", bool: true, id: 3}
];

function Component3 () {

    const list = products.map(products => <li key={products.id}> {products.name} </li>)

    return (

        <div>

            <h1>
                Componente 3
            </h1>

            <ol>
                {list}
            </ol>

        </div>
    )
}

export default Component3