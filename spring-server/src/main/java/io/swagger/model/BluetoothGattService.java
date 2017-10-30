package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BluetoothGattCharacteristic;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BluetoothGattService
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-30T16:30:18.546Z")

public class BluetoothGattService   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("primary")
  private Boolean primary = null;

  @JsonProperty("characteristics")
  private List<BluetoothGattCharacteristic> characteristics = null;

  public BluetoothGattService uuid(String uuid) {
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

  public BluetoothGattService primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @ApiModelProperty(value = "")


  public Boolean getPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public BluetoothGattService characteristics(List<BluetoothGattCharacteristic> characteristics) {
    this.characteristics = characteristics;
    return this;
  }

  public BluetoothGattService addCharacteristicsItem(BluetoothGattCharacteristic characteristicsItem) {
    if (this.characteristics == null) {
      this.characteristics = new ArrayList<BluetoothGattCharacteristic>();
    }
    this.characteristics.add(characteristicsItem);
    return this;
  }

   /**
   * Get characteristics
   * @return characteristics
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<BluetoothGattCharacteristic> getCharacteristics() {
    return characteristics;
  }

  public void setCharacteristics(List<BluetoothGattCharacteristic> characteristics) {
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
    BluetoothGattService bluetoothGattService = (BluetoothGattService) o;
    return Objects.equals(this.uuid, bluetoothGattService.uuid) &&
        Objects.equals(this.primary, bluetoothGattService.primary) &&
        Objects.equals(this.characteristics, bluetoothGattService.characteristics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, primary, characteristics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BluetoothGattService {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

