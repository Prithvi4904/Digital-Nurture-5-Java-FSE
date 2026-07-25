import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'creditLabel'
})
export class CreditLabelPipe implements PipeTransform {

  transform(value: number): string {
    return value + ' Credits';
  }

}
