interface Pingable{
    ping(): void;
}

class Point implements Pingable {
    _x: number = 0;
     y: number = 0;
    readonly name : string = "This point";


    constructor(otherName?: string) {
            if(otherName !== undefined) {
                this.name = otherName;
    
        }
    }

    static jump = () => console.log('jump');
    
    ping = (): void => console.log("ping");

    printPoint = () => `X: ${this.x}, Y: ${this.y}`;

    get x(): number {
        return this._x;
    } 

    set x(val: number){
        this._x = val;
    }
}

class DPoint extends Point{
    z: number = 0;

    printPoint = () => {
        return `X: ${this.x}, y: ${this.y}, Z: ${this.z}`
    }
}

type TPoint = {
    x: number,
    y: number
}

let p = new Point("That point");
    p.x = 12;
    p.y = 6;
    console.log(p.printPoint());
    //p.name = "That Point";

    Point.jump();













    class CBox<T> {
        _contents: T[] = [];

        addItem = (item: T) => this._contents.push(item);

        removeLastItem = () => this._contents.pop();

        get contents(){
            return this._contents;
        }

        set contents(val : T[]) {
            this._contents = val;
        }

    }