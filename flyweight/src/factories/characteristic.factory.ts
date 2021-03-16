import { Characteristics } from "../models/characteristics.model";
import { Sex } from "../models/sex.model";

export class CharacteristicsFactory {
    static instance: CharacteristicsFactory;
    characteristics: Characteristics[] = [];

    getCharacteristic(color?: string, eyeColor?: string, sex?: Sex, bodyType?: string): Characteristics {
        let characteristic;

        this.characteristics.forEach(c => {
            if (c && c.color === c.color && c.eyeColor === eyeColor && c.sex === sex && c.bodyType === bodyType) {
                characteristic = c;
            }
        })

        if (characteristic) {
            return characteristic;
        } else {
            console.log(this.characteristics);
            characteristic = new Characteristics(color, eyeColor, sex, bodyType);
            this.characteristics.push(characteristic);
            return characteristic;
        }
    }

    static getInstance(): CharacteristicsFactory {
        if (!CharacteristicsFactory.instance) {
            CharacteristicsFactory.instance = new CharacteristicsFactory();
        }
        return CharacteristicsFactory.instance;
    }


}