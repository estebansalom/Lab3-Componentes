package testbean;

import org.springframework.beans.factory.annotation.Autowired;

import writer.IWriter;

public class MySpringWriterBeanWithDependency {
	private IWriter writer;

    @Autowired
    public void setWriter(IWriter pWriter) {
        this.writer = pWriter;
    }

    public void run() {
        String s = "Sample string";
        writer.writer(s);
    }
}
