package UsersAndDesigns;

public class DesignEntity {
    String designId;
    String userId;
    String content;

    public DesignEntity(String designId, String userId) {
        this.designId = designId;
        this.userId = userId;
    }

    public String getDesignId() {
        return designId;
    }

    public void setDesignId(String designId) {
        this.designId = designId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

/*
design

deisngId: PK
userID: String -> ccreator
designContent: String;
cooperators: List<String> -> userIDs that can access the design;

 */

//select designId from design where userId = :userId;
