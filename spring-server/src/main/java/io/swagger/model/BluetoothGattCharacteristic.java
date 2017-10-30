package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BluetoothGattCharacteristic
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-30T16:30:18.546Z")

public class BluetoothGattCharacteristic   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("notifying")
  private Boolean notifying = null;

  @JsonProperty("characteristics")
  private List<String> characteristics = null;

  public BluetoothGattCharacteristic uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(value = "")


  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public BluetoothGattCharacteristic value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public BluetoothGattCharacteristic notifying(Boolean notifying) {
    this.notifying = notifying;
    return this;
  }

   /**
   * Get notifying
   * @return notifying
  **/
  @ApiModelProperty(value = "")


  public Boolean getNotifying() {
    return notifying;
  }

  public void setNotifying(Boolean notifying) {
    this.notifying = notifying;
  }

  public BluetoothGattCharacteristic characteristics(List<String> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  public BluetoothGattCharacteristic addCharacteristicsItem(String characteristicsItem) {
    if (this.characteristics == null) {
      this.characteristics = new ArrayList<String>();
    }
    this.characteristics.add(characteristicsItem);
    return this;
  }

   /**
   * Get characteristics
   * @return characteristics
  **/
  @ApiModelProperty(value = "")


  public List<String> getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(List<String> characteristics) {
    this.characteristics = characteristics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) o;
    return Objects.equals(this.uuid, bluetoothGattCharacteristic.uuid) &&
        Objects.equals(this.value, bluetoothGattCharacteristic.value) &&
        Objects.equals(this.notifying, bluetoothGattCharacteristic.notifying) &&
        Objects.equals(this.characteristics, bluetoothGattCharacteristic.characteristics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, value, notifying, characteristics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BluetoothGattCharacteristic {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    notifying: ").append(toIndentedString(notifying)).append("\n");
    sb.append("    characteristics: ").append(toIndentedString(characteristics)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

