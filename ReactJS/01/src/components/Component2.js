
import React from 'react'

export const Component2 = ({nombre, apellido, info}) => {
    return (
        <div>

        <h1>Componente 2</h1>

        <li>
            {nombre}
            {}
            {apellido}
        </li>

        <li>info.country</li>
        <li>info.state</li>

        </div>
    )
}

