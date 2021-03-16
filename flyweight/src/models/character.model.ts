import { Characteristics } from "./characteristics.model";

export class Character {
    name?: string;
    age?: number;
    characteristic?: Characteristics;

    constructor(name?: string, age?: number, characteristic?: Characteristics) {
        this.name = name;
        this.age = age;
        this.characteristic = characteristic;
    }
}