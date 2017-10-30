package io.swagger.api;

import io.swagger.model.BluetoothDevice;

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
public class BluetoothManagerApiController implements BluetoothManagerApi {



    public ResponseEntity<BluetoothDevice> getDevices() {
        // do some magic!
        return new ResponseEntity<BluetoothDevice>(HttpStatus.OK);
    }

    public ResponseEntity<Void> startDiscovery() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> stopDiscovery() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
