import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car {
    private Integer modelNumber;
    private String name;
    private String engineName;
    private String ownerName;
    private String manufacturer;
    private boolean hasABS;
    private boolean hasReverseParkingSensor;
    private boolean hasReverseParkingCamera;
    private boolean hasMultiMediaModule;

    @Override
    public String toString() {
        return "Car{" +
                "modelNumber=" + modelNumber +
                ", name='" + name + '\'' +
                ", engineName='" + engineName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", hasABS=" + hasABS +
                ", hasReverseParkingSensor=" + hasReverseParkingSensor +
                ", hasReverseParkingCamera=" + hasReverseParkingCamera +
                ", hasMultiMediaModule=" + hasMultiMediaModule +
                '}';
    }
}
