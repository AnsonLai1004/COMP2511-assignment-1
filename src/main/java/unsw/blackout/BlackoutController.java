package unsw.blackout;

import java.util.ArrayList;
import java.util.List;

import unsw.response.models.EntityInfoResponse;
import unsw.utils.Angle;

public class BlackoutController {
    private ArrayList<Device> devices = new ArrayList<Device>();
    private ArrayList<Satellite> satellites = new ArrayList<Satellite>();

    public void createDevice(String deviceId, String type, Angle position) {
        // TODO: Task 1a)
        Device newDevice;
        if (type == "HandheldDevice") {
            newDevice = new HandheldDevice(deviceId, type, position);
        } else if (type == "LaptopDevice") {
            newDevice = new LaptopDevice(deviceId, type, position);
        } else {
            newDevice = new DesktopDevice(deviceId, type, position);
        }
        devices.add(newDevice);
        return;
    }

    public void removeDevice(String deviceId) {
        // TODO: Task 1b)
        for (Device device : devices) {
            if (device.getDeviceId() == deviceId) {
                devices.remove(device);
                return;
            }
        }
    }

    public void createSatellite(String satelliteId, String type, double height, Angle position) {
        // TODO: Task 1c)
        Satellite newSatelite;
        if (type == "StandardSatellite") {
            newSatelite = new StandardSatellite(satelliteId, type, position, height);
        } else if (type == "TeleportingSatellite") {
            newSatelite = new TeleportingSatellite(satelliteId, type, position, height);
        } else {
            newSatelite = new RelaySatellite(satelliteId, type, position, height);
        }
        satellites.add(newSatelite);
        return;
    }

    public void removeSatellite(String satelliteId) {
        // TODO: Task 1d)
        for (Satellite satellite : satellites) {
            if (satellite.getSatelliteId() == satelliteId) {
                satellites.remove(satellite);
                return;
            }
        }
    }

    public List<String> listDeviceIds() {
        // TODO: Task 1e)
        return new ArrayList<>();
    }

    public List<String> listSatelliteIds() {
        // TODO: Task 1f)
        return new ArrayList<>();
    }

    public void addFileToDevice(String deviceId, String filename, String content) {
        // TODO: Task 1g)
    }

    public EntityInfoResponse getInfo(String id) {
        // TODO: Task 1h)
        return null;
    }

    public void simulate() {
        // TODO: Task 2a)
    }

    /**
     * Simulate for the specified number of minutes.
     * You shouldn't need to modify this function.
     */
    public void simulate(int numberOfMinutes) {
        for (int i = 0; i < numberOfMinutes; i++) {
            simulate();
        }
    }

    public List<String> communicableEntitiesInRange(String id) {
        // TODO: Task 2 b)
        return new ArrayList<>();
    }

    public void sendFile(String fileName, String fromId, String toId) throws FileTransferException {
        // TODO: Task 2 c)
    }

    public void createDevice(String deviceId, String type, Angle position, boolean isMoving) {
        createDevice(deviceId, type, position);
        // TODO: Task 3
    }

    public void createSlope(int startAngle, int endAngle, int gradient) {
        // TODO: Task 3
        // If you are not completing Task 3 you can leave this method blank :)
    }

}
