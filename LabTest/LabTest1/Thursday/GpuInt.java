package LabTest2;

public class GpuInt implements NumberInterface<GpuInt> {
    int value;

    GpuInt(int value) {
        this.value = value;
    }

    GpuInt() {
        this(0);
    }

    @Override
    public GpuInt fromInteger(int value) {
        return new GpuInt(value);
    }

    @Override
    public Integer toInteger() {
        return (Integer) value;
    }

    @Override
    public String toString() {
        return String.format("%s[%d]", getDevice(), this.value);
    }

    public String getDevice() {
        return "GPU";
    }

    public GpuInt add(GpuInt o) {
        System.out.printf("GPU Debug: %d + %d = %d\n", this.value,
                o.value, this.value + o.value);
        return new GpuInt(this.value + o.value);
    }

    public GpuInt mul(GpuInt o) {
        System.out.printf("GPU Debug: %d * %d = %d\n", this.value,
                o.value, this.value * o.value);
        return new GpuInt(this.value * o.value);
    }

}
