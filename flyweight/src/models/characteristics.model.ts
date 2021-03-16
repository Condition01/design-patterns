import { Sex } from "./sex.model";

export class Characteristics {
    color?: string;
    eyeColor?: string;
    sex?: Sex;
    bodyType?: String;
    static numberOfInstances = 0;

    constructor(color?: string, eyeColor?: string, sex?: Sex, bodyType?: string) {
        this.color = color;
        this.eyeColor = eyeColor;
        this.sex = sex;
        this.bodyType = bodyType;
        Characteristics.numberOfInstances = Characteristics.numberOfInstances + 1;
    }

}