
# BugTracker Project

## Overview

This repository is a simple bug tracker project. The project is divided into frontend and backend tasks. The main goal is to create a user interface (UI) for bug tracking along with backend logic to store and manage bug reports.

---

## Task Breakdown

### 1. **Frontend Layout and Styling**
- **Files Created:**
  - `index.html` (Basic structure for the bug tracker UI)
  - `styles.css` (Basic styling for the UI)
- **Commit Message:**
  - `feat: add frontend layout and styling`
- **Branches Involved:**
  - `frontend`
- **Push to GitHub:**
  - The changes were pushed to the `frontend` branch.

---

### 2. **Backend Logic for Bug Tracker**
- **File Created:**
  - `Main.java` (Basic backend logic for handling bug reports)
- **Commit Message:**
  - `feat: add backend logic for bug tracker`
- **Branches Involved:**
  - `backend`
- **Push to GitHub:**
  - The changes were pushed to the `backend` branch.

---

### 3. **Branch Management and Conflict Resolution**
- **Branches Created:**
  - `main` → Renamed to `dev-main`
  - `frontend`
  - `backend`
- **Tasks:**
  - Fixed merge conflicts in `index.html`.
  - Merged branches into `dev-main` as needed.
  - Deleted `main` and used `dev-main` as primary.

---

### 4. **Untracked Files and Stashing**
- **Untracked Files:**
  - `debug.txt`
  - `index.html`
  - `styles.css`
- **Tasks:**
  - Cleaned up untracked files before switching branches.
  - Used stash to temporarily save changes.

---

## Commands Summary

### Common Git Commands Used:
```bash
git clone https://github.com/yourusername/BugTracker.git
git branch
git checkout <branch-name>
git checkout -b <new-branch-name>
git add <file-name>
git commit -m "commit message"
git push origin <branch-name>
git pull origin <branch-name>
git stash push -m "Stash message"
git clean -fd
