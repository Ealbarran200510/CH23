
const source = "https://pokeapi.co/api/v2/pokemon/ditto";

fetch (source)

.then(Response=>Response.json())
.then(data=>showData(data))
.catch(result => console.log(result), e => console.log("Error en callback ${e}"));

const showData = (data) => {
    console.log(data)
    let body = ""
    for (var i = 0; i < data.length; i++) {      
        body+=`<tr>
                <td>${data[i].abilities}</td>
                <td>${data[i].moves}</td>
            </tr>`
    }
}