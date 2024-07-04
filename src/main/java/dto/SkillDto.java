package dto;

import enums.SkillType;

public class SkillDto {

    private String name;
    private String type;
    private int id;


    public SkillDto() {
    }

    public SkillDto(String name, String type, int id) {
        this.name = name;
        this.type = type;
        this.id = id;
    }

    public SkillDto(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
