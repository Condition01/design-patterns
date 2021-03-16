import { Characteristics } from "./models/characteristics.model";
import { Character } from "./models/character.model";
import { Sex } from "./models/sex.model"
import { CharacteristicsFactory } from "./factories/characteristic.factory"

//color?: string, eyeColor?: string, sex?: Sex, bodyType?: string
let c = new Character();
for (let i = 1; i <= 1000; i++) {
    c.age = i;
    c.name = `Name${i}`;
    c.characteristic = CharacteristicsFactory.getInstance().getCharacteristic('White', 'Blue', Sex.MALE, 'Strong');
    if(i != 1000) {
        c = new Character();
    }
}

console.log(Characteristics.numberOfInstances);
console.log(c);