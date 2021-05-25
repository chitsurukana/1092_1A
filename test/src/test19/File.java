package test19;

import java.util.List;

public class File extends Dir {

	public File(String name) {
		super(name);
	}

	@Override
	public void addDir(Dir dir) {
		throw new UnsupportedOperationException("檔案物件不支援該操作");
	}

	@Override
	public void rmDir(Dir dir) {
		throw new UnsupportedOperationException("檔案物件不支援該操作");
	}

	@Override
	public void clear() {
		throw new UnsupportedOperationException("檔案物件不支援該操作");
	}

	@Override
	public void print() {
		System.out.print(getName());
	}

	@Override
	public List<Dir> getFiles() {
		throw new UnsupportedOperationException("檔案物件不支援該操作");
	}

}
