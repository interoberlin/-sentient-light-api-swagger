package io.swagger.api;

import io.swagger.model.BluetoothGattCharacteristic;
import io.swagger.model.BluetoothGattService;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-30T16:30:18.546Z")

@Controller
public class BluetoothServiceApiController implements BluetoothServiceApi {



    public ResponseEntity<BluetoothGattService> getBluetoothGattService(@ApiParam(value = "The uuid of the bluetooth device. ",required=true ) @PathVariable("uuid") String uuid) {
        // do some magic!
        return new ResponseEntity<BluetoothGattService>(HttpStatus.OK);
    }

    public ResponseEntity<BluetoothGattCharacteristic> getCharacteristics(@ApiParam(value = "The uuid of the bluetooth service. ",required=true ) @PathVariable("uuid") String uuid) {
        // do some magic!
        return new ResponseEntity<BluetoothGattCharacteristic>(HttpStatus.OK);
    }

}
