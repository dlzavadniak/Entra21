console.log("Teste");


//let numeros: (number | string)[];
//numeros = [true, 0, ""];

let f = (x: number, y: number) => {
    return x + y;
}

let numeros: number;
numeros = f(2.4, 6);

type Rect = {
    width: number;
    height: 30
}

type Triangle = {
    angle: number,
    type: "isoceles" | "scalene" | "obtuse"
}

type Circle = {
    radius: number
}

type GeometricFigure = Rect | Triangle | Circle;


let rect: Rect = {
    width:20,
    height:30
}

let t: GeometricFigure = {
    angle: 45,
    type: "isoceles"
}

t ={
    radius: 9
} 


