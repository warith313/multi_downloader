package com.iraqtechno.multidownloader;

public class DownloadTask {
    int primaryId;
    String taskId;
    int status;
    int progress;
    String url;
    String filename;
    String image;
    String srt;
    String name;
    String savedDir;
    String headers;
    String mimeType;
    boolean resumable;
    boolean showNotification;
    boolean openFileFromNotification;
    long timeCreated;

    DownloadTask(int primaryId, String taskId, int status, int progress, String url, String filename, String image, String srt, String name, String savedDir,
                 String headers, String mimeType, boolean resumable, boolean showNotification, boolean openFileFromNotification, long timeCreated) {
        this.primaryId = primaryId;
        this.taskId = taskId;
        this.status = status;
        this.progress = progress;
        this.url = url;
        this.filename = filename;
        this.image = image;
        this.srt = srt;
        this.name = name;
        this.savedDir = savedDir;
        this.headers = headers;
        this.mimeType = mimeType;
        this.resumable = resumable;
        this.showNotification = showNotification;
        this.openFileFromNotification = openFileFromNotification;
        this.timeCreated = timeCreated;
    }

    @Override
    public String toString() {
        return "DownloadTask{taskId=" + taskId + ",status=" + status + ",progress=" + progress + ",url=" + url + ",filename=" + filename + ",image=" + image + ",srt=" + srt + ",name=" + name + ",savedDir=" + savedDir + ",headers=" + headers + "}";
    }
}
