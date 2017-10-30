package io.swagger.api;

import io.swagger.model.FloorSensor;

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
public class FloorSensorApiController implements FloorSensorApi {



    public ResponseEntity<FloorSensor> subscribe(@ApiParam(value = "The id of the floor sensor.",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<FloorSensor>(HttpStatus.OK);
    }

}
