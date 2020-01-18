package com.hhuda.dpj.builder;

public class LunchOrder {
    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;



    static class Builder{
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public LunchOrder build(){
            return new LunchOrder(this);
        }

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }
    }

    public LunchOrder(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.condiments;
        this.meat = builder.meat;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(bread);
        sb.append("\n");
        sb.append(condiments);
        sb.append("\n");
        sb.append(dressing);
        sb.append("\n");
        sb.append(meat);
        return sb.toString();
    }
}
