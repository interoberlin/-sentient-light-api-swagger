package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BluetoothGattService;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BluetoothDevice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-10-30T16:30:18.546Z")

public class BluetoothDevice   {
  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("services")
  private List<BluetoothGattService> services = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("alias")
  private String alias = null;

  @JsonProperty("paired")
  private Boolean paired = null;

  @JsonProperty("trusted")
  private Boolean trusted = null;

  @JsonProperty("blocked")
  private Boolean blocked = null;

  @JsonProperty("rssi")
  private Integer rssi = null;

  @JsonProperty("txPower")
  private Integer txPower = null;

  public BluetoothDevice uuid(String uuid) {
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

  public BluetoothDevice services(List<BluetoothGattService> services) {
    this.services = services;
    return this;
  }

  public BluetoothDevice addServicesItem(BluetoothGattService servicesItem) {
    if (this.services == null) {
      this.services = new ArrayList<BluetoothGattService>();
    }
    this.services.add(servicesItem);
    return this;
  }

   /**
   * Get services
   * @return services
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<BluetoothGattService> getServices() {
    return services;
  }

  public void setServices(List<BluetoothGattService> services) {
    this.services = services;
  }

  public BluetoothDevice address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public BluetoothDevice name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BluetoothDevice alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @ApiModelProperty(value = "")


  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public BluetoothDevice paired(Boolean paired) {
    this.paired = paired;
    return this;
  }

   /**
   * Get paired
   * @return paired
  **/
  @ApiModelProperty(value = "")


  public Boolean getPaired() {
    return paired;
  }

  public void setPaired(Boolean paired) {
    this.paired = paired;
  }

  public BluetoothDevice trusted(Boolean trusted) {
    this.trusted = trusted;
    return this;
  }

   /**
   * Get trusted
   * @return trusted
  **/
  @ApiModelProperty(value = "")


  public Boolean getTrusted() {
    return trusted;
  }

  public void setTrusted(Boolean trusted) {
    this.trusted = trusted;
  }

  public BluetoothDevice blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

   /**
   * Get blocked
   * @return blocked
  **/
  @ApiModelProperty(value = "")


  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }

  public BluetoothDevice rssi(Integer rssi) {
    this.rssi = rssi;
    return this;
  }

   /**
   * Get rssi
   * @return rssi
  **/
  @ApiModelProperty(value = "")


  public Integer getRssi() {
    return rssi;
  }

  public void setRssi(Integer rssi) {
    this.rssi = rssi;
  }

  public BluetoothDevice txPower(Integer txPower) {
    this.txPower = txPower;
    return this;
  }

   /**
   * Get txPower
   * @return txPower
  **/
  @ApiModelProperty(value = "")


  public Integer getTxPower() {
    return txPower;
  }

  public void setTxPower(Integer txPower) {
    this.txPower = txPower;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BluetoothDevice bluetoothDevice = (BluetoothDevice) o;
    return Objects.equals(this.uuid, bluetoothDevice.uuid) &&
        Objects.equals(this.services, bluetoothDevice.services) &&
        Objects.equals(this.address, bluetoothDevice.address) &&
        Objects.equals(this.name, bluetoothDevice.name) &&
        Objects.equals(this.alias, bluetoothDevice.alias) &&
        Objects.equals(this.paired, bluetoothDevice.paired) &&
        Objects.equals(this.trusted, bluetoothDevice.trusted) &&
        Objects.equals(this.blocked, bluetoothDevice.blocked) &&
        Objects.equals(this.rssi, bluetoothDevice.rssi) &&
        Objects.equals(this.txPower, bluetoothDevice.txPower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, services, address, name, alias, paired, trusted, blocked, rssi, txPower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BluetoothDevice {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    paired: ").append(toIndentedString(paired)).append("\n");
    sb.append("    trusted: ").append(toIndentedString(trusted)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    rssi: ").append(toIndentedString(rssi)).append("\n");
    sb.append("    txPower: ").append(toIndentedString(txPower)).append("\n");
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

