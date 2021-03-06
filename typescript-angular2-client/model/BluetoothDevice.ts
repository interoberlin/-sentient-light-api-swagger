/**
 * Swagger Sentient Light
 * This is the API description of Interoberlin Sentient Light
 *
 * OpenAPI spec version: 1.0.0
 * Contact: florian.schwanz@interoberlin.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

import * as models from './models';

export interface BluetoothDevice {
    uuid?: string;

    services?: Array<models.BluetoothGattService>;

    address?: string;

    name?: string;

    alias?: string;

    paired?: boolean;

    trusted?: boolean;

    blocked?: boolean;

    rssi?: number;

    txPower?: number;

}
