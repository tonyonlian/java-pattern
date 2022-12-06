package cn.tunyl.creational.builder;

public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    private Phone(Builder builder) {

        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
    }

    public static class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }

    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("cpu")
                .memory("memory")
                .screen("screen")
                .mainboard("mainboard")
                .build();

    }
}
